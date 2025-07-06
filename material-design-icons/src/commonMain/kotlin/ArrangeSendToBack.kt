package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrangeSendToBack: ImageVector
    get() {
        if (_ArrangeSendToBack != null) {
            return _ArrangeSendToBack!!
        }
        _ArrangeSendToBack = ImageVector.Builder(
            name = "ArrangeSendToBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(9f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                moveTo(22f, 13f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                moveTo(15f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                moveTo(16f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(11f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ArrangeSendToBack!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeSendToBack: ImageVector? = null
