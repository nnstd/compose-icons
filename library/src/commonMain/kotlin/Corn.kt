package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Corn: ImageVector
    get() {
        if (_Corn != null) {
            return _Corn!!
        }
        _Corn = ImageVector.Builder(
            name = "Corn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 12f)
                horizontalLineTo(8.82f)
                curveTo(9.62f, 12.5f, 10.35f, 13.07f, 11f, 13.68f)
                verticalLineTo(12f)
                moveTo(7f, 11f)
                curveTo(7.27f, 5.88f, 9.37f, 2f, 12f, 2f)
                curveTo(14.66f, 2f, 16.77f, 5.94f, 17f, 11.12f)
                curveTo(18.5f, 10.43f, 20.17f, 10f, 22f, 10f)
                curveTo(16.25f, 12.57f, 18.25f, 22f, 12f, 22f)
                curveTo(6f, 22f, 7.93f, 12.57f, 2f, 10f)
                curveTo(3.82f, 10f, 5.5f, 10.4f, 7f, 11f)
                moveTo(11f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(8.24f)
                lineTo(8.03f, 11f)
                horizontalLineTo(11f)
                moveTo(11f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(9.05f)
                curveTo(8.8f, 6.6f, 8.6f, 7.27f, 8.43f, 8f)
                horizontalLineTo(11f)
                moveTo(11f, 5f)
                verticalLineTo(3.3f)
                curveTo(10.45f, 3.63f, 9.95f, 4.22f, 9.5f, 5f)
                horizontalLineTo(11f)
                moveTo(12f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(12.23f)
                curveTo(13.42f, 16.45f, 14.15f, 18f, 14.32f, 19.23f)
                curveTo(15.31f, 17.56f, 15.96f, 14.84f, 16f, 11.76f)
                curveTo(15.94f, 7f, 14.13f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _Corn!!
    }

@Suppress("ObjectPropertyName")
private var _Corn: ImageVector? = null
