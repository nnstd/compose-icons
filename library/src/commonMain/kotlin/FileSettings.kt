package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileSettings: ImageVector
    get() {
        if (_FileSettings != null) {
            return _FileSettings!!
        }
        _FileSettings = ImageVector.Builder(
            name = "FileSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 0f)
                curveTo(4.89f, 0f, 4f, 0.89f, 4f, 2f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18f)
                verticalLineTo(6f)
                lineTo(14f, 0f)
                horizontalLineTo(6f)
                moveTo(13f, 1.5f)
                lineTo(18.5f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(1.5f)
                moveTo(7f, 22f)
                verticalLineTo(24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                moveTo(11f, 22f)
                verticalLineTo(24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                moveTo(15f, 22f)
                verticalLineTo(24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _FileSettings!!
    }

@Suppress("ObjectPropertyName")
private var _FileSettings: ImageVector? = null
