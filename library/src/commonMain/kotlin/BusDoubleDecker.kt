package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusDoubleDecker: ImageVector
    get() {
        if (_BusDoubleDecker != null) {
            return _BusDoubleDecker!!
        }
        _BusDoubleDecker = ImageVector.Builder(
            name = "BusDoubleDecker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                curveTo(1.89f, 4f, 1f, 4.89f, 1f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(14f)
                curveTo(23f, 12.89f, 22.11f, 12f, 21f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(9.5f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                curveTo(23f, 4.89f, 22.11f, 4f, 21f, 4f)
                horizontalLineTo(3f)
                moveTo(2.5f, 5.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(8f)
                horizontalLineTo(2.5f)
                verticalLineTo(5.5f)
                moveTo(8f, 5.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(5.5f)
                moveTo(13.5f, 5.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(8f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.5f)
                moveTo(19f, 5.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(5.5f)
                moveTo(13.5f, 9.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(12f)
                horizontalLineTo(13.5f)
                verticalLineTo(9.5f)
                moveTo(2.5f, 9.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(12f)
                horizontalLineTo(2.5f)
                verticalLineTo(9.5f)
                moveTo(8f, 9.5f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(9.5f)
                moveTo(6f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.5f)
                moveTo(18f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.5f)
                close()
            }
        }.build()

        return _BusDoubleDecker!!
    }

@Suppress("ObjectPropertyName")
private var _BusDoubleDecker: ImageVector? = null
