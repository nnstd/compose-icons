package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableCheck: ImageVector
    get() {
        if (_TableCheck != null) {
            return _TableCheck!!
        }
        _TableCheck = ImageVector.Builder(
            name = "TableCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(18f)
                curveTo(19.11f, 3f, 20f, 3.9f, 20f, 5f)
                verticalLineTo(12.08f)
                curveTo(18.45f, 11.82f, 16.92f, 12.18f, 15.68f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(13.08f)
                curveTo(12.97f, 17.68f, 12.97f, 18.35f, 13.08f, 19f)
                horizontalLineTo(4f)
                curveTo(2.9f, 19f, 2f, 18.11f, 2f, 17f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                moveTo(4f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(12f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                moveTo(4f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                moveTo(17.75f, 21f)
                lineTo(15f, 18f)
                lineTo(16.16f, 16.84f)
                lineTo(17.75f, 18.43f)
                lineTo(21.34f, 14.84f)
                lineTo(22.5f, 16.25f)
                lineTo(17.75f, 21f)
            }
        }.build()

        return _TableCheck!!
    }

@Suppress("ObjectPropertyName")
private var _TableCheck: ImageVector? = null
