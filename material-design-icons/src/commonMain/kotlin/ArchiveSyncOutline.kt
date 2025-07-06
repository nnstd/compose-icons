package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveSyncOutline: ImageVector
    get() {
        if (_ArchiveSyncOutline != null) {
            return _ArchiveSyncOutline!!
        }
        _ArchiveSyncOutline = ImageVector.Builder(
            name = "ArchiveSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11.18f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(11.03f)
                curveTo(19.84f, 11f, 19.67f, 11f, 19.5f, 11f)
                curveTo(19f, 11f, 18.5f, 11.07f, 18f, 11.18f)
                moveTo(15f, 11.5f)
                curveTo(15f, 11.22f, 14.78f, 11f, 14.5f, 11f)
                horizontalLineTo(9.5f)
                curveTo(9.22f, 11f, 9f, 11.22f, 9f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(14.82f)
                curveTo(14.88f, 12.94f, 14.94f, 12.88f, 15f, 12.82f)
                verticalLineTo(11.5f)
                moveTo(6f, 19f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(14.03f)
                curveTo(13.64f, 20.39f, 13.35f, 19.72f, 13.18f, 19f)
                horizontalLineTo(6f)
                moveTo(21f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                moveTo(19f, 13.5f)
                verticalLineTo(12f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 16.5f)
                verticalLineTo(15f)
                curveTo(20.38f, 15f, 21.5f, 16.12f, 21.5f, 17.5f)
                curveTo(21.5f, 17.9f, 21.41f, 18.28f, 21.24f, 18.62f)
                lineTo(22.33f, 19.71f)
                curveTo(22.75f, 19.08f, 23f, 18.32f, 23f, 17.5f)
                curveTo(23f, 15.29f, 21.21f, 13.5f, 19f, 13.5f)
                moveTo(19f, 20f)
                curveTo(17.62f, 20f, 16.5f, 18.88f, 16.5f, 17.5f)
                curveTo(16.5f, 17.1f, 16.59f, 16.72f, 16.76f, 16.38f)
                lineTo(15.67f, 15.29f)
                curveTo(15.25f, 15.92f, 15f, 16.68f, 15f, 17.5f)
                curveTo(15f, 19.71f, 16.79f, 21.5f, 19f, 21.5f)
                verticalLineTo(23f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 18.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ArchiveSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveSyncOutline: ImageVector? = null
