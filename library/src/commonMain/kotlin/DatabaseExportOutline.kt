package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseExportOutline: ImageVector
    get() {
        if (_DatabaseExportOutline != null) {
            return _DatabaseExportOutline!!
        }
        _DatabaseExportOutline = ImageVector.Builder(
            name = "DatabaseExportOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.86f, 18f)
                lineTo(18.9f, 19f)
                curveTo(17.5f, 20.2f, 14.94f, 21f, 12f, 21f)
                curveTo(7.59f, 21f, 4f, 19.21f, 4f, 17f)
                verticalLineTo(7f)
                curveTo(4f, 4.79f, 7.58f, 3f, 12f, 3f)
                curveTo(14.95f, 3f, 17.5f, 3.8f, 18.9f, 5f)
                lineTo(17.86f, 6f)
                lineTo(17.5f, 6.4f)
                curveTo(16.65f, 5.77f, 14.78f, 5f, 12f, 5f)
                curveTo(8.13f, 5f, 6f, 6.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 9f, 12f, 9f)
                curveTo(13.37f, 9f, 14.5f, 8.81f, 15.42f, 8.54f)
                lineTo(16.38f, 9.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.92f)
                curveTo(13f, 10.97f, 12.5f, 11f, 12f, 11f)
                curveTo(9.61f, 11f, 7.47f, 10.47f, 6f, 9.64f)
                verticalLineTo(12.45f)
                curveTo(7.3f, 13.4f, 9.58f, 14f, 12f, 14f)
                curveTo(12.5f, 14f, 13f, 13.97f, 13.5f, 13.92f)
                verticalLineTo(14.5f)
                horizontalLineTo(16.38f)
                lineTo(15.38f, 15.5f)
                lineTo(15.5f, 15.61f)
                curveTo(14.41f, 15.86f, 13.24f, 16f, 12f, 16f)
                curveTo(9.72f, 16f, 7.61f, 15.55f, 6f, 14.77f)
                verticalLineTo(17f)
                curveTo(6f, 17.5f, 8.13f, 19f, 12f, 19f)
                curveTo(14.78f, 19f, 16.65f, 18.23f, 17.5f, 17.61f)
                lineTo(17.86f, 18f)
                moveTo(18.92f, 7.08f)
                lineTo(17.5f, 8.5f)
                lineTo(20f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                lineTo(17.5f, 15.5f)
                lineTo(18.92f, 16.92f)
                lineTo(23.84f, 12f)
                lineTo(18.92f, 7.08f)
                close()
            }
        }.build()

        return _DatabaseExportOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseExportOutline: ImageVector? = null
