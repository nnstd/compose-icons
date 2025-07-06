package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountNetworkOutline: ImageVector
    get() {
        if (_AccountNetworkOutline != null) {
            return _AccountNetworkOutline!!
        }
        _AccountNetworkOutline = ImageVector.Builder(
            name = "AccountNetworkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                moveTo(12f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                moveTo(15f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15.5f)
                curveTo(19f, 13.57f, 15.87f, 12f, 12f, 12f)
                curveTo(8.13f, 12f, 5f, 13.57f, 5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 23f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                moveTo(7.61f, 15f)
                curveTo(8.39f, 14.53f, 9.89f, 14f, 12f, 14f)
                curveTo(14.11f, 14f, 15.61f, 14.53f, 16.39f, 15f)
                horizontalLineTo(7.61f)
                close()
            }
        }.build()

        return _AccountNetworkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountNetworkOutline: ImageVector? = null
