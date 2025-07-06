package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusAlert: ImageVector
    get() {
        if (_BusAlert != null) {
            return _BusAlert!!
        }
        _BusAlert = ImageVector.Builder(
            name = "BusAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 1f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 8f)
                curveTo(23f, 11.53f, 20.39f, 14.45f, 17f, 14.93f)
                verticalLineTo(18f)
                curveTo(17f, 18.84f, 16.65f, 19.58f, 15.96f, 20.2f)
                verticalLineTo(22f)
                curveTo(15.96f, 22.27f, 15.87f, 22.5f, 15.68f, 22.71f)
                curveTo(15.5f, 22.91f, 15.26f, 23f, 15f, 23f)
                horizontalLineTo(14f)
                curveTo(13.71f, 23f, 13.47f, 22.91f, 13.27f, 22.71f)
                curveTo(13.06f, 22.5f, 12.96f, 22.27f, 12.96f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(5.04f)
                verticalLineTo(22f)
                curveTo(5.04f, 22.27f, 4.94f, 22.5f, 4.73f, 22.71f)
                curveTo(4.53f, 22.91f, 4.29f, 23f, 4f, 23f)
                horizontalLineTo(3f)
                curveTo(2.74f, 23f, 2.5f, 22.91f, 2.32f, 22.71f)
                curveTo(2.13f, 22.5f, 2.04f, 22.27f, 2.04f, 22f)
                verticalLineTo(20.2f)
                curveTo(1.35f, 19.58f, 1f, 18.84f, 1f, 18f)
                verticalLineTo(8f)
                curveTo(1f, 6.42f, 1.7f, 5.35f, 3.07f, 4.8f)
                curveTo(4.44f, 4.26f, 6.42f, 4f, 9f, 4f)
                lineTo(10.23f, 4.03f)
                curveTo(11.5f, 2.2f, 13.61f, 1f, 16f, 1f)
                moveTo(16f, 3f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 3f)
                moveTo(15f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                moveTo(15f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                moveTo(3f, 13f)
                horizontalLineTo(11.09f)
                curveTo(9.8f, 11.72f, 9f, 9.96f, 9f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                moveTo(4.5f, 16f)
                curveTo(3.69f, 16f, 3f, 16.67f, 3f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 19f)
                curveTo(5.35f, 19f, 6f, 18.33f, 6f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 16f)
                moveTo(13.5f, 16f)
                curveTo(12.65f, 16f, 12f, 16.67f, 12f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 19f)
                curveTo(14.31f, 19f, 15f, 18.33f, 15f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 16f)
                close()
            }
        }.build()

        return _BusAlert!!
    }

@Suppress("ObjectPropertyName")
private var _BusAlert: ImageVector? = null
