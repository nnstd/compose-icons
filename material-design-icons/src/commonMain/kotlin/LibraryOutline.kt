package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LibraryOutline: ImageVector
    get() {
        if (_LibraryOutline != null) {
            return _LibraryOutline!!
        }
        _LibraryOutline = ImageVector.Builder(
            name = "LibraryOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14.27f)
                lineTo(10.64f, 13f)
                curveTo(9.09f, 11.57f, 7.16f, 10.57f, 5f, 10.18f)
                verticalLineTo(17.13f)
                curveTo(7.61f, 17.47f, 10f, 18.47f, 12f, 19.95f)
                curveTo(14f, 18.47f, 16.39f, 17.47f, 19f, 17.13f)
                verticalLineTo(10.18f)
                curveTo(16.84f, 10.57f, 14.91f, 11.57f, 13.36f, 13f)
                moveTo(19f, 8.15f)
                curveTo(19.65f, 8.05f, 20.32f, 8f, 21f, 8f)
                verticalLineTo(19f)
                curveTo(17.5f, 19f, 14.36f, 20.35f, 12f, 22.54f)
                curveTo(9.64f, 20.35f, 6.5f, 19f, 3f, 19f)
                verticalLineTo(8f)
                curveTo(3.68f, 8f, 4.35f, 8.05f, 5f, 8.15f)
                curveTo(7.69f, 8.56f, 10.1f, 9.78f, 12f, 11.54f)
                curveTo(13.9f, 9.78f, 16.31f, 8.56f, 19f, 8.15f)
                moveTo(12f, 6f)
                curveTo(12.27f, 6f, 12.5f, 5.9f, 12.71f, 5.71f)
                curveTo(12.9f, 5.5f, 13f, 5.27f, 13f, 5f)
                reflectiveCurveTo(12.9f, 4.5f, 12.71f, 4.29f)
                curveTo(12.5f, 4.11f, 12.27f, 4f, 12f, 4f)
                reflectiveCurveTo(11.5f, 4.11f, 11.29f, 4.29f)
                curveTo(11.11f, 4.5f, 11f, 4.74f, 11f, 5f)
                reflectiveCurveTo(11.11f, 5.5f, 11.29f, 5.71f)
                curveTo(11.5f, 5.9f, 11.74f, 6f, 12f, 6f)
                moveTo(14.12f, 7.12f)
                curveTo(13.56f, 7.68f, 12.8f, 8f, 12f, 8f)
                reflectiveCurveTo(10.44f, 7.68f, 9.88f, 7.12f)
                curveTo(9.32f, 6.56f, 9f, 5.8f, 9f, 5f)
                reflectiveCurveTo(9.32f, 3.44f, 9.88f, 2.88f)
                curveTo(10.44f, 2.32f, 11.2f, 2f, 12f, 2f)
                reflectiveCurveTo(13.56f, 2.32f, 14.12f, 2.88f)
                reflectiveCurveTo(15f, 4.2f, 15f, 5f)
                reflectiveCurveTo(14.68f, 6.56f, 14.12f, 7.12f)
                close()
            }
        }.build()

        return _LibraryOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LibraryOutline: ImageVector? = null
