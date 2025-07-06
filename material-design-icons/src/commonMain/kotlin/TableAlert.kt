package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableAlert: ImageVector
    get() {
        if (_TableAlert != null) {
            return _TableAlert!!
        }
        _TableAlert = ImageVector.Builder(
            name = "TableAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(17f)
                curveTo(18.11f, 4f, 19f, 4.89f, 19f, 6f)
                verticalLineTo(18f)
                curveTo(19f, 19.11f, 18.11f, 20f, 17f, 20f)
                horizontalLineTo(3f)
                curveTo(1.9f, 20f, 1f, 19.11f, 1f, 18f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.9f, 4f, 3f, 4f)
                moveTo(3f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                moveTo(11f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                moveTo(3f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                moveTo(11f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                moveTo(23f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                moveTo(23f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TableAlert!!
    }

@Suppress("ObjectPropertyName")
private var _TableAlert: ImageVector? = null
