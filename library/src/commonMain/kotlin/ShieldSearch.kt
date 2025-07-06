package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldSearch: ImageVector
    get() {
        if (_ShieldSearch != null) {
            return _ShieldSearch!!
        }
        _ShieldSearch = ImageVector.Builder(
            name = "ShieldSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(17.86f, 19.31f)
                curveTo(16.23f, 21.22f, 14.28f, 22.45f, 12f, 23f)
                curveTo(9.44f, 22.39f, 7.3f, 20.93f, 5.58f, 18.63f)
                curveTo(3.86f, 16.34f, 3f, 13.8f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 13.39f, 20.36f, 15.61f, 19.08f, 17.67f)
                lineTo(16.17f, 14.76f)
                curveTo(16.69f, 13.97f, 17f, 13f, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                curveTo(13f, 17f, 13.97f, 16.69f, 14.76f, 16.17f)
                lineTo(17.86f, 19.31f)
                close()
            }
        }.build()

        return _ShieldSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSearch: ImageVector? = null
