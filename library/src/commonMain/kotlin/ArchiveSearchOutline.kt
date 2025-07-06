package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveSearchOutline: ImageVector
    get() {
        if (_ArchiveSearchOutline != null) {
            return _ArchiveSearchOutline!!
        }
        _ArchiveSearchOutline = ImageVector.Builder(
            name = "ArchiveSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.04f, 10f)
                curveTo(12.64f, 10.25f, 12.26f, 10.55f, 11.9f, 10.9f)
                curveTo(11.57f, 11.24f, 11.27f, 11.61f, 11.03f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(10.5f)
                curveTo(8f, 10.22f, 8.22f, 10f, 8.5f, 10f)
                horizontalLineTo(13.04f)
                moveTo(20f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                moveTo(18f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                moveTo(5f, 18f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(11.82f)
                curveTo(11.24f, 19.4f, 10.8f, 18.72f, 10.5f, 18f)
                horizontalLineTo(5f)
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

        return _ArchiveSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveSearchOutline: ImageVector? = null
