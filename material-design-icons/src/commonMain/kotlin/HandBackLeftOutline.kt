package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandBackLeftOutline: ImageVector
    get() {
        if (_HandBackLeftOutline != null) {
            return _HandBackLeftOutline!!
        }
        _HandBackLeftOutline = ImageVector.Builder(
            name = "HandBackLeftOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                curveTo(3f, 20.42f, 6.58f, 24f, 11f, 24f)
                curveTo(14.43f, 24f, 17.5f, 21.91f, 18.77f, 18.73f)
                lineTo(21.33f, 12.3f)
                curveTo(21.58f, 11.66f, 21.56f, 10.92f, 21.18f, 10.35f)
                curveTo(20.69f, 9.61f, 19.82f, 9.29f, 19f, 9.5f)
                lineTo(18.22f, 9.73f)
                curveTo(17.76f, 9.85f, 17.34f, 10.08f, 17f, 10.39f)
                verticalLineTo(4.5f)
                curveTo(17f, 3.12f, 15.88f, 2f, 14.5f, 2f)
                curveTo(14.31f, 2f, 14.13f, 2f, 13.96f, 2.06f)
                curveTo(13.75f, 0.89f, 12.73f, 0f, 11.5f, 0f)
                curveTo(10.44f, 0f, 9.54f, 0.66f, 9.17f, 1.59f)
                curveTo(8.96f, 1.53f, 8.73f, 1.5f, 8.5f, 1.5f)
                curveTo(7.12f, 1.5f, 6f, 2.62f, 6f, 4f)
                verticalLineTo(4.55f)
                curveTo(5.84f, 4.5f, 5.67f, 4.5f, 5.5f, 4.5f)
                curveTo(4.12f, 4.5f, 3f, 5.62f, 3f, 7f)
                verticalLineTo(16f)
                moveTo(5f, 7f)
                curveTo(5f, 6.72f, 5.22f, 6.5f, 5.5f, 6.5f)
                reflectiveCurveTo(6f, 6.72f, 6f, 7f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                curveTo(8f, 3.72f, 8.22f, 3.5f, 8.5f, 3.5f)
                reflectiveCurveTo(9f, 3.72f, 9f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(2.5f)
                curveTo(11f, 2.22f, 11.22f, 2f, 11.5f, 2f)
                reflectiveCurveTo(12f, 2.22f, 12f, 2.5f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(4.5f)
                curveTo(14f, 4.22f, 14.22f, 4f, 14.5f, 4f)
                reflectiveCurveTo(15f, 4.22f, 15f, 4.5f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                lineTo(18f, 12.5f)
                curveTo(18.15f, 12.05f, 18.5f, 11.71f, 19f, 11.59f)
                lineTo(19.5f, 11.45f)
                lineTo(16.91f, 18f)
                curveTo(15.95f, 20.41f, 13.61f, 22f, 11f, 22f)
                curveTo(7.69f, 22f, 5f, 19.31f, 5f, 16f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _HandBackLeftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HandBackLeftOutline: ImageVector? = null
