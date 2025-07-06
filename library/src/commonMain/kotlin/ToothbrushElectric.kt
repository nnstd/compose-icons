package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToothbrushElectric: ImageVector
    get() {
        if (_ToothbrushElectric != null) {
            return _ToothbrushElectric!!
        }
        _ToothbrushElectric = ImageVector.Builder(
            name = "ToothbrushElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.5f)
                verticalLineTo(14f)
                curveTo(10.34f, 14f, 9f, 15.34f, 9f, 17f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                curveTo(17f, 15.34f, 15.66f, 14f, 14f, 14f)
                verticalLineTo(3.5f)
                curveTo(14f, 2.4f, 13.11f, 1.5f, 12f, 1.5f)
                moveTo(7.5f, 2f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7.5f)
                horizontalLineTo(9f)
                verticalLineTo(3.5f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(7.5f)
                moveTo(13f, 17.5f)
                curveTo(13.83f, 17.5f, 14.5f, 18.17f, 14.5f, 19f)
                curveTo(14.5f, 19.83f, 13.83f, 20.5f, 13f, 20.5f)
                curveTo(12.17f, 20.5f, 11.5f, 19.83f, 11.5f, 19f)
                curveTo(11.5f, 18.17f, 12.17f, 17.5f, 13f, 17.5f)
                close()
            }
        }.build()

        return _ToothbrushElectric!!
    }

@Suppress("ObjectPropertyName")
private var _ToothbrushElectric: ImageVector? = null
