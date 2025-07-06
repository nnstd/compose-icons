package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WallSconceOutline: ImageVector
    get() {
        if (_WallSconceOutline != null) {
            return _WallSconceOutline!!
        }
        _WallSconceOutline = ImageVector.Builder(
            name = "WallSconceOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.7f, 6f)
                lineTo(15.92f, 11f)
                horizontalLineTo(10.08f)
                lineTo(12.3f, 6f)
                horizontalLineTo(13.7f)
                moveTo(15f, 4f)
                horizontalLineTo(11f)
                lineTo(7f, 13f)
                horizontalLineTo(19f)
                lineTo(15f, 4f)
                moveTo(4f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _WallSconceOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WallSconceOutline: ImageVector? = null
