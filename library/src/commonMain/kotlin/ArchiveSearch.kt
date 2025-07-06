package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveSearch: ImageVector
    get() {
        if (_ArchiveSearch != null) {
            return _ArchiveSearch!!
        }
        _ArchiveSearch = ImageVector.Builder(
            name = "ArchiveSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(11.03f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(10.5f)
                curveTo(8f, 10.22f, 8.22f, 10f, 8.5f, 10f)
                horizontalLineTo(13.04f)
                curveTo(14.84f, 8.87f, 17.07f, 8.7f, 19f, 9.5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(11.82f)
                curveTo(9.7f, 17.8f, 9.44f, 14.5f, 11.03f, 12f)
                moveTo(23.39f, 21f)
                lineTo(22f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20f, 16.5f, 20f)
                curveTo(14f, 20f, 12f, 18f, 12f, 15.5f)
                reflectiveCurveTo(14f, 11f, 16.5f, 11f)
                reflectiveCurveTo(21f, 13f, 21f, 15.5f)
                curveTo(21f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21f)
                moveTo(19f, 15.5f)
                curveTo(19f, 14.12f, 17.88f, 13f, 16.5f, 13f)
                reflectiveCurveTo(14f, 14.12f, 14f, 15.5f)
                reflectiveCurveTo(15.12f, 18f, 16.5f, 18f)
                reflectiveCurveTo(19f, 16.88f, 19f, 15.5f)
                close()
            }
        }.build()

        return _ArchiveSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveSearch: ImageVector? = null
