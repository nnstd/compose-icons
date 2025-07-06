package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gatsby: ImageVector
    get() {
        if (_Gatsby != null) {
            return _Gatsby!!
        }
        _Gatsby = ImageVector.Builder(
            name = "Gatsby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(8.27f, 4f, 5.14f, 6.55f, 4.25f, 10f)
                lineTo(14f, 19.75f)
                curveTo(17.45f, 18.86f, 20f, 15.73f, 20f, 12f)
                horizontalLineTo(14.75f)
                verticalLineTo(13.5f)
                horizontalLineTo(18.2f)
                curveTo(17.71f, 15.54f, 16.24f, 17.19f, 14.31f, 17.94f)
                lineTo(6.06f, 9.69f)
                curveTo(7f, 7.31f, 9.3f, 5.63f, 12f, 5.63f)
                curveTo(14.13f, 5.63f, 16f, 6.67f, 17.18f, 8.28f)
                lineTo(18.41f, 7.22f)
                curveTo(16.95f, 5.26f, 14.63f, 4f, 12f, 4f)
                moveTo(4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                curveTo(12.04f, 20f, 12.09f, 20f, 4f, 12f)
                close()
            }
        }.build()

        return _Gatsby!!
    }

@Suppress("ObjectPropertyName")
private var _Gatsby: ImageVector? = null
