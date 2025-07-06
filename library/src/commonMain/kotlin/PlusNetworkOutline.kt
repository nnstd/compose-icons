package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlusNetworkOutline: ImageVector
    get() {
        if (_PlusNetworkOutline != null) {
            return _PlusNetworkOutline!!
        }
        _PlusNetworkOutline = ImageVector.Builder(
            name = "PlusNetworkOutline",
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
                moveTo(15f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _PlusNetworkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PlusNetworkOutline: ImageVector? = null
