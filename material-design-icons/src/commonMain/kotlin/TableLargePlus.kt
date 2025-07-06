package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableLargePlus: ImageVector
    get() {
        if (_TableLargePlus != null) {
            return _TableLargePlus!!
        }
        _TableLargePlus = ImageVector.Builder(
            name = "TableLargePlus",
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
                moveTo(17f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
            }
        }.build()

        return _TableLargePlus!!
    }

@Suppress("ObjectPropertyName")
private var _TableLargePlus: ImageVector? = null
