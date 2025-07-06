package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseImportOutline: ImageVector
    get() {
        if (_DatabaseImportOutline != null) {
            return _DatabaseImportOutline!!
        }
        _DatabaseImportOutline = ImageVector.Builder(
            name = "DatabaseImportOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.84f, 12f)
                lineTo(3.92f, 16.92f)
                lineTo(2.5f, 15.5f)
                lineTo(5f, 13f)
                horizontalLineTo(0f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                lineTo(2.5f, 8.5f)
                lineTo(3.92f, 7.08f)
                lineTo(8.84f, 12f)
                moveTo(12f, 3f)
                curveTo(8.59f, 3f, 5.68f, 4.07f, 4.53f, 5.57f)
                lineTo(5f, 6f)
                lineTo(6.03f, 7.07f)
                curveTo(6f, 7.05f, 6f, 7f, 6f, 7f)
                curveTo(6f, 6.5f, 8.13f, 5f, 12f, 5f)
                reflectiveCurveTo(18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                curveTo(9.38f, 9f, 7.58f, 8.31f, 6.68f, 7.72f)
                lineTo(9.8f, 10.84f)
                curveTo(10.5f, 10.94f, 11.24f, 11f, 12f, 11f)
                curveTo(14.39f, 11f, 16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(12.45f)
                curveTo(16.7f, 13.4f, 14.42f, 14f, 12f, 14f)
                curveTo(11.04f, 14f, 10.1f, 13.9f, 9.24f, 13.73f)
                lineTo(7.59f, 15.37f)
                curveTo(8.91f, 15.77f, 10.41f, 16f, 12f, 16f)
                curveTo(14.28f, 16f, 16.39f, 15.55f, 18f, 14.77f)
                verticalLineTo(17f)
                curveTo(18f, 17.5f, 15.87f, 19f, 12f, 19f)
                reflectiveCurveTo(6f, 17.5f, 6f, 17f)
                verticalLineTo(16.96f)
                lineTo(5f, 18f)
                lineTo(4.54f, 18.43f)
                curveTo(5.69f, 19.93f, 8.6f, 21f, 12f, 21f)
                curveTo(16.41f, 21f, 20f, 19.21f, 20f, 17f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _DatabaseImportOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseImportOutline: ImageVector? = null
