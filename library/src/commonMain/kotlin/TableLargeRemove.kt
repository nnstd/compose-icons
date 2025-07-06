package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableLargeRemove: ImageVector
    get() {
        if (_TableLargeRemove != null) {
            return _TableLargeRemove!!
        }
        _TableLargeRemove = ImageVector.Builder(
            name = "TableLargeRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.35f, 20f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(12.09f)
                curveTo(12.21f, 16.28f, 12.46f, 15.61f, 12.81f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(13.54f)
                curveTo(14.58f, 13f, 15.25f, 12.61f, 16f, 12.35f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(12.35f)
                curveTo(20.75f, 12.61f, 21.42f, 13f, 22f, 13.54f)
                verticalLineTo(5f)
                curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(13.54f)
                curveTo(13f, 21.42f, 12.61f, 20.75f, 12.35f, 20f)
                moveTo(16f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                moveTo(10f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(8f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                moveTo(8f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                moveTo(8f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.46f, 15.88f)
            }
        }.build()

        return _TableLargeRemove!!
    }

@Suppress("ObjectPropertyName")
private var _TableLargeRemove: ImageVector? = null
