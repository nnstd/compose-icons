package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wechat: ImageVector
    get() {
        if (_Wechat != null) {
            return _Wechat!!
        }
        _Wechat = ImageVector.Builder(
            name = "Wechat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 4f)
                curveTo(5.36f, 4f, 2f, 6.69f, 2f, 10f)
                curveTo(2f, 11.89f, 3.08f, 13.56f, 4.78f, 14.66f)
                lineTo(4f, 17f)
                lineTo(6.5f, 15.5f)
                curveTo(7.39f, 15.81f, 8.37f, 16f, 9.41f, 16f)
                curveTo(9.15f, 15.37f, 9f, 14.7f, 9f, 14f)
                curveTo(9f, 10.69f, 12.13f, 8f, 16f, 8f)
                curveTo(16.19f, 8f, 16.38f, 8f, 16.56f, 8.03f)
                curveTo(15.54f, 5.69f, 12.78f, 4f, 9.5f, 4f)
                moveTo(6.5f, 6.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 7.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 8.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 7.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 6.5f)
                moveTo(11.5f, 6.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 7.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 8.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 7.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 6.5f)
                moveTo(16f, 9f)
                curveTo(12.69f, 9f, 10f, 11.24f, 10f, 14f)
                curveTo(10f, 16.76f, 12.69f, 19f, 16f, 19f)
                curveTo(16.67f, 19f, 17.31f, 18.92f, 17.91f, 18.75f)
                lineTo(20f, 20f)
                lineTo(19.38f, 18.13f)
                curveTo(20.95f, 17.22f, 22f, 15.71f, 22f, 14f)
                curveTo(22f, 11.24f, 19.31f, 9f, 16f, 9f)
                moveTo(14f, 11.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11.5f)
                moveTo(18f, 11.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11.5f)
                close()
            }
        }.build()

        return _Wechat!!
    }

@Suppress("ObjectPropertyName")
private var _Wechat: ImageVector? = null
