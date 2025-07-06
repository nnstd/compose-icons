package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmokingPipe: ImageVector
    get() {
        if (_SmokingPipe != null) {
            return _SmokingPipe!!
        }
        _SmokingPipe = ImageVector.Builder(
            name = "SmokingPipe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                curveTo(14.89f, 13f, 14f, 13.89f, 14f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                curveTo(12f, 18f, 11f, 17.92f, 10.3f, 17.23f)
                lineTo(6.53f, 13.47f)
                curveTo(5.6f, 12.53f, 4.33f, 12f, 3f, 12f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                curveTo(3.8f, 14f, 4.56f, 14.32f, 5.12f, 14.88f)
                lineTo(8.89f, 18.65f)
                curveTo(11.72f, 21.5f, 13f, 22f, 16f, 22f)
                horizontalLineTo(18f)
                curveTo(20.21f, 22f, 22f, 20.21f, 22f, 18f)
                verticalLineTo(15f)
                curveTo(22f, 13.89f, 21.11f, 13f, 20f, 13f)
                horizontalLineTo(16f)
                moveTo(14f, 7.2f)
                horizontalLineTo(12.5f)
                curveTo(11.45f, 7.12f, 10.65f, 6.25f, 10.65f, 5.2f)
                curveTo(10.67f, 4.22f, 11.5f, 3.43f, 12.46f, 3.45f)
                lineTo(12.5f, 3.45f)
                verticalLineTo(2f)
                curveTo(10.65f, 2f, 9.15f, 3.5f, 9.15f, 5.35f)
                reflectiveCurveTo(10.65f, 8.7f, 12.5f, 8.7f)
                horizontalLineTo(14f)
                curveTo(15.07f, 8.66f, 15.96f, 9.5f, 16f, 10.56f)
                curveTo(16f, 10.61f, 16f, 10.65f, 16f, 10.7f)
                verticalLineTo(12f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.36f)
                curveTo(17.42f, 8.53f, 15.88f, 7.12f, 14.05f, 7.2f)
                lineTo(14f, 7.2f)
                moveTo(20f, 9.76f)
                verticalLineTo(12f)
                horizontalLineTo(18.5f)
                verticalLineTo(9.77f)
                lineTo(18.5f, 9.7f)
                curveTo(18.5f, 7.5f, 16.71f, 5.7f, 14.5f, 5.7f)
                verticalLineTo(4.2f)
                horizontalLineTo(14.5f)
                curveTo(15.5f, 4.2f, 16.35f, 3.37f, 16.35f, 2.35f)
                curveTo(16.35f, 2.23f, 16.34f, 2.11f, 16.32f, 2f)
                horizontalLineTo(17.79f)
                curveTo(17.89f, 3f, 17.58f, 4f, 16.82f, 4.73f)
                horizontalLineTo(16.85f)
                curveTo(18.78f, 5.66f, 20f, 7.62f, 20f, 9.76f)
                close()
            }
        }.build()

        return _SmokingPipe!!
    }

@Suppress("ObjectPropertyName")
private var _SmokingPipe: ImageVector? = null
