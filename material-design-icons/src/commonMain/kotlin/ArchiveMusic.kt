package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveMusic: ImageVector
    get() {
        if (_ArchiveMusic != null) {
            return _ArchiveMusic!!
        }
        _ArchiveMusic = ImageVector.Builder(
            name = "ArchiveMusic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 16.11f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(13.03f)
                curveTo(13f, 20.84f, 13f, 20.67f, 13f, 20.5f)
                curveTo(13f, 18.36f, 14.5f, 16.57f, 16.5f, 16.11f)
                moveTo(9f, 13f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 11f, 15f, 11.22f, 15f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                moveTo(22f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(20.5f)
                curveTo(20f, 21.88f, 18.88f, 23f, 17.5f, 23f)
                reflectiveCurveTo(15f, 21.88f, 15f, 20.5f)
                reflectiveCurveTo(16.12f, 18f, 17.5f, 18f)
                curveTo(17.86f, 18f, 18.19f, 18.07f, 18.5f, 18.21f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ArchiveMusic!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveMusic: ImageVector? = null
