package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Balloon: ImageVector
    get() {
        if (_Balloon != null) {
            return _Balloon!!
        }
        _Balloon = ImageVector.Builder(
            name = "Balloon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.16f, 12.74f)
                lineTo(14f, 14f)
                horizontalLineTo(12.5f)
                curveTo(12.35f, 16.71f, 12f, 19.41f, 11.5f, 22.08f)
                lineTo(10.5f, 21.92f)
                curveTo(11f, 19.3f, 11.34f, 16.66f, 11.5f, 14f)
                horizontalLineTo(10f)
                lineTo(10.84f, 12.74f)
                curveTo(8.64f, 11.79f, 7f, 8.36f, 7f, 6f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 6f)
                curveTo(17f, 8.36f, 15.36f, 11.79f, 13.16f, 12.74f)
                close()
            }
        }.build()

        return _Balloon!!
    }

@Suppress("ObjectPropertyName")
private var _Balloon: ImageVector? = null
