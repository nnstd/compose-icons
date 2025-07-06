package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartBoxPlusOutline: ImageVector
    get() {
        if (_ChartBoxPlusOutline != null) {
            return _ChartBoxPlusOutline!!
        }
        _ChartBoxPlusOutline = ImageVector.Builder(
            name = "ChartBoxPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(15f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                moveTo(11f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                moveTo(9f, 17f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _ChartBoxPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBoxPlusOutline: ImageVector? = null
