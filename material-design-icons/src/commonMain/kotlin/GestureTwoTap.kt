package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GestureTwoTap: ImageVector
    get() {
        if (_GestureTwoTap != null) {
            return _GestureTwoTap!!
        }
        _GestureTwoTap = ImageVector.Builder(
            name = "GestureTwoTap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15.14f)
                verticalLineTo(21.5f)
                curveTo(18.97f, 22.32f, 18.32f, 22.97f, 17.5f, 23f)
                horizontalLineTo(11f)
                curveTo(10.62f, 23f, 10.26f, 22.85f, 10f, 22.57f)
                lineTo(5.1f, 18.37f)
                lineTo(5.84f, 17.6f)
                curveTo(6.03f, 17.39f, 6.3f, 17.28f, 6.58f, 17.28f)
                horizontalLineTo(6.8f)
                lineTo(10f, 19f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                verticalLineTo(12f)
                lineTo(18.15f, 13.84f)
                curveTo(18.66f, 14.07f, 19f, 14.58f, 19f, 15.14f)
                moveTo(15f, 10.45f)
                verticalLineTo(9.24f)
                lineTo(15f, 9.23f)
                curveTo(15.23f, 9.03f, 15.42f, 8.79f, 15.57f, 8.54f)
                curveTo(15.84f, 8.09f, 16f, 7.56f, 16f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4f)
                curveTo(12.21f, 4f, 11.5f, 4.31f, 10.95f, 4.81f)
                lineTo(10.81f, 4.95f)
                curveTo(10.68f, 5.09f, 10.56f, 5.24f, 10.46f, 5.4f)
                curveTo(10.36f, 5.56f, 10.27f, 5.74f, 10.2f, 5.92f)
                curveTo(10.17f, 6f, 10.15f, 6.06f, 10.13f, 6.13f)
                curveTo(8.9f, 6.5f, 8f, 7.65f, 8f, 9f)
                curveTo(8f, 9.7f, 8.24f, 10.34f, 8.64f, 10.85f)
                curveTo(8.74f, 11f, 8.87f, 11.11f, 9f, 11.23f)
                verticalLineTo(11.24f)
                lineTo(9f, 12.46f)
                verticalLineTo(12.46f)
                curveTo(7.8f, 11.77f, 7f, 10.5f, 7f, 9f)
                curveTo(7f, 7.38f, 7.97f, 6f, 9.35f, 5.35f)
                curveTo(10f, 3.97f, 11.38f, 3f, 13f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                curveTo(17f, 8.5f, 16.2f, 9.77f, 15f, 10.46f)
                verticalLineTo(10.45f)
                close()
            }
        }.build()

        return _GestureTwoTap!!
    }

@Suppress("ObjectPropertyName")
private var _GestureTwoTap: ImageVector? = null
