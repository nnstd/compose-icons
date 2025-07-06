package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MosqueOutline: ImageVector
    get() {
        if (_MosqueOutline != null) {
            return _MosqueOutline!!
        }
        _MosqueOutline = ImageVector.Builder(
            name = "MosqueOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                curveTo(24f, 5.9f, 22f, 4f, 22f, 4f)
                reflectiveCurveTo(20f, 5.9f, 20f, 7f)
                curveTo(20f, 7.7f, 20.4f, 8.4f, 21f, 8.7f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                curveTo(19f, 10.1f, 18.3f, 9.3f, 17.5f, 9.1f)
                curveTo(17.8f, 8.5f, 18f, 7.9f, 18f, 7.1f)
                curveTo(18f, 5.8f, 17.4f, 4.6f, 16.3f, 3.9f)
                lineTo(12f, 1f)
                lineTo(7.7f, 3.8f)
                curveTo(6.7f, 4.6f, 6f, 5.8f, 6f, 7.1f)
                curveTo(6f, 7.8f, 6.2f, 8.5f, 6.6f, 9.1f)
                curveTo(5.7f, 9.3f, 5f, 10.1f, 5f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(8.7f)
                curveTo(3.6f, 8.4f, 4f, 7.7f, 4f, 7f)
                curveTo(4f, 5.9f, 2f, 4f, 2f, 4f)
                reflectiveCurveTo(0f, 5.9f, 0f, 7f)
                curveTo(0f, 7.7f, 0.4f, 8.4f, 1f, 8.7f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                curveTo(11f, 16.5f, 11.4f, 16f, 12f, 16f)
                reflectiveCurveTo(13f, 16.5f, 13f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(23f)
                verticalLineTo(8.7f)
                curveTo(23.6f, 8.4f, 24f, 7.7f, 24f, 7f)
                moveTo(8.9f, 5.5f)
                lineTo(12f, 3.4f)
                lineTo(15.1f, 5.5f)
                curveTo(15.7f, 5.9f, 16f, 6.4f, 16f, 7.1f)
                curveTo(16f, 8.1f, 15.1f, 9f, 14.1f, 9f)
                horizontalLineTo(9.9f)
                curveTo(8.9f, 9f, 8f, 8.1f, 8f, 7.1f)
                curveTo(8f, 6.4f, 8.3f, 5.9f, 8.9f, 5.5f)
                moveTo(21f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                curveTo(15f, 15.4f, 13.6f, 14f, 12f, 14f)
                reflectiveCurveTo(9f, 15.4f, 9f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _MosqueOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MosqueOutline: ImageVector? = null
