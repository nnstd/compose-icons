package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CubeSend: ImageVector
    get() {
        if (_CubeSend != null) {
            return _CubeSend!!
        }
        _CubeSend = ImageVector.Builder(
            name = "CubeSend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                lineTo(9f, 8.04f)
                verticalLineTo(15.96f)
                lineTo(16f, 20f)
                lineTo(23f, 15.96f)
                verticalLineTo(8.04f)
                moveTo(16f, 6.31f)
                lineTo(19.8f, 8.5f)
                lineTo(16f, 10.69f)
                lineTo(12.21f, 8.5f)
                moveTo(0f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(11f, 10.11f)
                lineTo(15f, 12.42f)
                verticalLineTo(17.11f)
                lineTo(11f, 14.81f)
                moveTo(21f, 10.11f)
                verticalLineTo(14.81f)
                lineTo(17f, 17.11f)
                verticalLineTo(12.42f)
                moveTo(2f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(4f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
            }
        }.build()

        return _CubeSend!!
    }

@Suppress("ObjectPropertyName")
private var _CubeSend: ImageVector? = null
