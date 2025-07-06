package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseNetworkOutline: ImageVector
    get() {
        if (_CloseNetworkOutline != null) {
            return _CloseNetworkOutline!!
        }
        _CloseNetworkOutline = ImageVector.Builder(
            name = "CloseNetworkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
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
                moveTo(7f, 15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(15.54f, 12.12f)
                lineTo(13.41f, 10f)
                lineTo(15.53f, 7.87f)
                lineTo(14.12f, 6.46f)
                lineTo(12f, 8.59f)
                lineTo(9.88f, 6.46f)
                lineTo(8.47f, 7.87f)
                lineTo(10.59f, 10f)
                lineTo(8.47f, 12.13f)
                lineTo(9.88f, 13.54f)
                lineTo(12f, 11.41f)
                lineTo(14.12f, 13.54f)
                lineTo(15.54f, 12.12f)
                close()
            }
        }.build()

        return _CloseNetworkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloseNetworkOutline: ImageVector? = null
