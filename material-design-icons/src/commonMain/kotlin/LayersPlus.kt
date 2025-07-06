package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LayersPlus: ImageVector
    get() {
        if (_LayersPlus != null) {
            return _LayersPlus!!
        }
        _LayersPlus = ImageVector.Builder(
            name = "LayersPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(11f, 16f)
                lineTo(2f, 9f)
                lineTo(11f, 2f)
                lineTo(20f, 9f)
                lineTo(11f, 16f)
                moveTo(11f, 18.54f)
                lineTo(12f, 17.75f)
                verticalLineTo(18f)
                curveTo(12f, 18.71f, 12.12f, 19.39f, 12.35f, 20f)
                lineTo(11f, 21.07f)
                lineTo(2f, 14.07f)
                lineTo(3.62f, 12.81f)
                lineTo(11f, 18.54f)
                close()
            }
        }.build()

        return _LayersPlus!!
    }

@Suppress("ObjectPropertyName")
private var _LayersPlus: ImageVector? = null
