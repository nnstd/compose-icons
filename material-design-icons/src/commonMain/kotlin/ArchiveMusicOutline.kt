package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveMusicOutline: ImageVector
    get() {
        if (_ArchiveMusicOutline != null) {
            return _ArchiveMusicOutline!!
        }
        _ArchiveMusicOutline = ImageVector.Builder(
            name = "ArchiveMusicOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(18f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                moveTo(14.5f, 11f)
                curveTo(14.78f, 11f, 15f, 11.22f, 15f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                moveTo(13.26f, 19f)
                curveTo(13.09f, 19.47f, 13f, 19.97f, 13f, 20.5f)
                curveTo(13f, 20.67f, 13f, 20.84f, 13.03f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(13.26f)
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

        return _ArchiveMusicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveMusicOutline: ImageVector? = null
