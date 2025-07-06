package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCode: ImageVector
    get() {
        if (_FileCode != null) {
            return _FileCode!!
        }
        _FileCode = ImageVector.Builder(
            name = "FileCode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(18.5f)
                lineTo(13f, 3.5f)
                verticalLineTo(9f)
                moveTo(6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                moveTo(6.12f, 15.5f)
                lineTo(9.86f, 19.24f)
                lineTo(11.28f, 17.83f)
                lineTo(8.95f, 15.5f)
                lineTo(11.28f, 13.17f)
                lineTo(9.86f, 11.76f)
                lineTo(6.12f, 15.5f)
                moveTo(17.28f, 15.5f)
                lineTo(13.54f, 11.76f)
                lineTo(12.12f, 13.17f)
                lineTo(14.45f, 15.5f)
                lineTo(12.12f, 17.83f)
                lineTo(13.54f, 19.24f)
                lineTo(17.28f, 15.5f)
                close()
            }
        }.build()

        return _FileCode!!
    }

@Suppress("ObjectPropertyName")
private var _FileCode: ImageVector? = null
