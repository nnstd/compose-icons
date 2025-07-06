package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RedoVariant: ImageVector
    get() {
        if (_RedoVariant != null) {
            return _RedoVariant!!
        }
        _RedoVariant = ImageVector.Builder(
            name = "RedoVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 7f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(10.5f)
                curveTo(8f, 18f, 6f, 16f, 6f, 13.5f)
                curveTo(6f, 11f, 8f, 9f, 10.5f, 9f)
                horizontalLineTo(16.17f)
                lineTo(13.09f, 12.09f)
                lineTo(14.5f, 13.5f)
                lineTo(20f, 8f)
                lineTo(14.5f, 2.5f)
                lineTo(13.08f, 3.91f)
                lineTo(16.17f, 7f)
                horizontalLineTo(10.5f)
                moveTo(18f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _RedoVariant!!
    }

@Suppress("ObjectPropertyName")
private var _RedoVariant: ImageVector? = null
