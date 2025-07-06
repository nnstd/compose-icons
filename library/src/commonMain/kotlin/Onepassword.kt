package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Onepassword: ImageVector
    get() {
        if (_Onepassword != null) {
            return _Onepassword!!
        }
        _Onepassword = ImageVector.Builder(
            name = "Onepassword",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(5.92f, 1f, 1f, 5.92f, 1f, 12f)
                curveTo(1f, 18.08f, 5.92f, 23f, 12f, 23f)
                curveTo(18.08f, 23f, 23f, 18.08f, 23f, 12f)
                curveTo(23f, 5.92f, 18.08f, 1f, 12f, 1f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                moveTo(13f, 13.5f)
                curveTo(13f, 14.13f, 13.4f, 14.7f, 14f, 14.91f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(11.91f)
                curveTo(10.78f, 11.64f, 11.19f, 10.8f, 10.93f, 10f)
                curveTo(10.78f, 9.58f, 10.44f, 9.24f, 10f, 9.09f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(12.09f)
                curveTo(13.4f, 12.3f, 13f, 12.87f, 13f, 13.5f)
                close()
            }
        }.build()

        return _Onepassword!!
    }

@Suppress("ObjectPropertyName")
private var _Onepassword: ImageVector? = null
