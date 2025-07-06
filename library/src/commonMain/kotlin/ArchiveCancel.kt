package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveCancel: ImageVector
    get() {
        if (_ArchiveCancel != null) {
            return _ArchiveCancel!!
        }
        _ArchiveCancel = ImageVector.Builder(
            name = "ArchiveCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 12f)
                curveTo(19f, 12f, 19.5f, 12.07f, 20f, 12.18f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(12.5f)
                curveTo(12.18f, 20.23f, 12f, 19.39f, 12f, 18.5f)
                curveTo(12f, 14.91f, 14.91f, 12f, 18.5f, 12f)
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
                moveTo(18.5f, 14f)
                curveTo(16f, 14f, 14f, 16f, 14f, 18.5f)
                reflectiveCurveTo(16f, 23f, 18.5f, 23f)
                reflectiveCurveTo(23f, 21f, 23f, 18.5f)
                reflectiveCurveTo(21f, 14f, 18.5f, 14f)
                moveTo(18.5f, 21.5f)
                curveTo(16.84f, 21.5f, 15.5f, 20.16f, 15.5f, 18.5f)
                curveTo(15.5f, 17.94f, 15.65f, 17.42f, 15.92f, 17f)
                lineTo(20f, 21.08f)
                curveTo(19.58f, 21.35f, 19.06f, 21.5f, 18.5f, 21.5f)
                moveTo(21.08f, 20f)
                lineTo(17f, 15.92f)
                curveTo(17.42f, 15.65f, 17.94f, 15.5f, 18.5f, 15.5f)
                curveTo(20.16f, 15.5f, 21.5f, 16.84f, 21.5f, 18.5f)
                curveTo(21.5f, 19.06f, 21.35f, 19.58f, 21.08f, 20f)
                close()
            }
        }.build()

        return _ArchiveCancel!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveCancel: ImageVector? = null
