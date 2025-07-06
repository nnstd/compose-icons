package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailSearch: ImageVector
    get() {
        if (_EmailSearch != null) {
            return _EmailSearch!!
        }
        _EmailSearch = ImageVector.Builder(
            name = "EmailSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                verticalLineTo(10.82f)
                curveTo(20f, 9.85f, 18.7f, 9.23f, 17.31f, 9.06f)
                lineTo(19f, 8f)
                verticalLineTo(6f)
                lineTo(11f, 11f)
                lineTo(3f, 6f)
                verticalLineTo(8f)
                lineTo(10.62f, 12.76f)
                curveTo(10.21f, 13.62f, 10f, 14.55f, 10f, 15.5f)
                curveTo(10f, 17.18f, 10.65f, 18.79f, 11.81f, 20f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 18f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.89f, 4f, 3f, 4f)
                moveTo(16.5f, 11f)
                curveTo(19f, 11f, 21f, 13f, 21f, 15.5f)
                curveTo(21f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21f)
                lineTo(22f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20f, 16.5f, 20f)
                curveTo(14f, 20f, 12f, 18f, 12f, 15.5f)
                curveTo(12f, 13f, 14f, 11f, 16.5f, 11f)
                moveTo(16.5f, 13f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 18f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 13f)
                close()
            }
        }.build()

        return _EmailSearch!!
    }

@Suppress("ObjectPropertyName")
private var _EmailSearch: ImageVector? = null
