package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableCancel: ImageVector
    get() {
        if (_TableCancel != null) {
            return _TableCancel!!
        }
        _TableCancel = ImageVector.Builder(
            name = "TableCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(17f)
                curveTo(18.11f, 3f, 19f, 3.9f, 19f, 5f)
                verticalLineTo(12.08f)
                curveTo(17.45f, 11.82f, 15.92f, 12.18f, 14.68f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(12.08f)
                curveTo(11.97f, 17.68f, 11.97f, 18.35f, 12.08f, 19f)
                horizontalLineTo(3f)
                curveTo(1.9f, 19f, 1f, 18.11f, 1f, 17f)
                verticalLineTo(5f)
                curveTo(1f, 3.9f, 1.9f, 3f, 3f, 3f)
                moveTo(3f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(11f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(3f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
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

        return _TableCancel!!
    }

@Suppress("ObjectPropertyName")
private var _TableCancel: ImageVector? = null
