package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Halloween: ImageVector
    get() {
        if (_Halloween != null) {
            return _Halloween!!
        }
        _Halloween = ImageVector.Builder(
            name = "Halloween",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 6f)
                curveTo(7.47f, 6f, 8.37f, 6.5f, 9.11f, 7.38f)
                curveTo(9.66f, 6.79f, 10.31f, 6.36f, 11f, 6.15f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(6.15f)
                curveTo(13.69f, 6.36f, 14.34f, 6.79f, 14.89f, 7.38f)
                curveTo(15.63f, 6.5f, 16.53f, 6f, 17.5f, 6f)
                curveTo(20f, 6f, 22f, 9.36f, 22f, 13.5f)
                curveTo(22f, 17.64f, 20f, 21f, 17.5f, 21f)
                curveTo(16.53f, 21f, 15.63f, 20.5f, 14.89f, 19.62f)
                curveTo(14.08f, 20.5f, 13.08f, 21f, 12f, 21f)
                curveTo(10.92f, 21f, 9.92f, 20.5f, 9.11f, 19.62f)
                curveTo(8.37f, 20.5f, 7.47f, 21f, 6.5f, 21f)
                curveTo(4f, 21f, 2f, 17.64f, 2f, 13.5f)
                curveTo(2f, 9.36f, 4f, 6f, 6.5f, 6f)
                moveTo(9f, 10f)
                lineTo(7.75f, 12.25f)
                horizontalLineTo(10.25f)
                lineTo(9f, 10f)
                moveTo(15f, 10f)
                lineTo(13.75f, 12.25f)
                horizontalLineTo(16.25f)
                lineTo(15f, 10f)
                moveTo(8f, 17f)
                horizontalLineTo(10f)
                lineTo(11f, 16f)
                lineTo(12f, 17f)
                horizontalLineTo(14f)
                lineTo(15f, 16f)
                lineTo(16f, 17f)
                lineTo(17.5f, 14f)
                lineTo(13.92f, 14.62f)
                lineTo(13f, 16f)
                lineTo(12f, 15f)
                horizontalLineTo(10f)
                lineTo(9f, 16f)
                lineTo(8f, 15f)
                lineTo(6f, 14f)
                lineTo(8f, 17f)
                close()
            }
        }.build()

        return _Halloween!!
    }

@Suppress("ObjectPropertyName")
private var _Halloween: ImageVector? = null
