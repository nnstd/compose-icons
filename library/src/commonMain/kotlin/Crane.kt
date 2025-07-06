package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Crane: ImageVector
    get() {
        if (_Crane != null) {
            return _Crane!!
        }
        _Crane = ImageVector.Builder(
            name = "Crane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(19.92f)
                lineTo(12f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(10.62f)
                curveTo(16.53f, 10.79f, 16.19f, 11.23f, 16.19f, 11.76f)
                curveTo(16.19f, 12.2f, 16.43f, 12.6f, 16.8f, 12.82f)
                verticalLineTo(14f)
                horizontalLineTo(17.42f)
                curveTo(17.76f, 14f, 18.03f, 14.28f, 18.03f, 14.62f)
                curveTo(18.03f, 14.96f, 17.76f, 15.24f, 17.42f, 15.24f)
                curveTo(17.2f, 15.24f, 17f, 15.12f, 16.89f, 14.93f)
                curveTo(16.71f, 14.64f, 16.34f, 14.54f, 16.05f, 14.71f)
                curveTo(15.75f, 14.87f, 15.65f, 15.25f, 15.82f, 15.55f)
                curveTo(16.15f, 16.11f, 16.76f, 16.47f, 17.42f, 16.47f)
                curveTo(18.43f, 16.47f, 19.26f, 15.64f, 19.26f, 14.62f)
                curveTo(19.26f, 13.84f, 18.76f, 13.14f, 18.03f, 12.88f)
                verticalLineTo(12.82f)
                curveTo(18.41f, 12.6f, 18.65f, 12.2f, 18.65f, 11.76f)
                curveTo(18.65f, 11.3f, 18.38f, 10.91f, 18f, 10.7f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                moveTo(8f, 13.66f)
                lineTo(7f, 14.66f)
                verticalLineTo(13.24f)
                lineTo(8f, 12.24f)
                verticalLineTo(13.66f)
                moveTo(8f, 10.71f)
                lineTo(7f, 11.71f)
                verticalLineTo(10.29f)
                lineTo(8f, 9.29f)
                verticalLineTo(10.71f)
                moveTo(7f, 8.71f)
                verticalLineTo(7.29f)
                lineTo(8f, 6.29f)
                verticalLineTo(7.71f)
                lineTo(7f, 8.71f)
                close()
            }
        }.build()

        return _Crane!!
    }

@Suppress("ObjectPropertyName")
private var _Crane: ImageVector? = null
