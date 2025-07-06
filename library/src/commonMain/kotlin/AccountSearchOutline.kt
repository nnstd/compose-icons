package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSearchOutline: ImageVector
    get() {
        if (_AccountSearchOutline != null) {
            return _AccountSearchOutline!!
        }
        _AccountSearchOutline = ImageVector.Builder(
            name = "AccountSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                curveTo(9.65f, 13.59f, 9.36f, 14.24f, 9.19f, 14.93f)
                curveTo(6.5f, 15.16f, 3.9f, 16.42f, 3.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(9.2f)
                curveTo(9.37f, 18.78f, 9.65f, 19.42f, 10f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 14.34f, 7.33f, 13f, 10f, 13f)
                moveTo(10f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                curveTo(14f, 8.91f, 13.69f, 9.75f, 13.18f, 10.43f)
                curveTo(12.32f, 10.75f, 11.55f, 11.26f, 10.91f, 11.9f)
                lineTo(10f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                moveTo(10f, 5.9f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.9f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10.1f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.1f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 5.9f)
                moveTo(15.5f, 12f)
                curveTo(18f, 12f, 20f, 14f, 20f, 16.5f)
                curveTo(20f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                lineTo(22.39f, 22f)
                lineTo(21f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21f, 15.5f, 21f)
                curveTo(13f, 21f, 11f, 19f, 11f, 16.5f)
                curveTo(11f, 14f, 13f, 12f, 15.5f, 12f)
                moveTo(15.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14f)
                close()
            }
        }.build()

        return _AccountSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSearchOutline: ImageVector? = null
