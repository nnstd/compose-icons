package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TallyMark1: ImageVector
    get() {
        if (_TallyMark1 != null) {
            return _TallyMark1!!
        }
        _TallyMark1 = ImageVector.Builder(
            name = "TallyMark1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _TallyMark1!!
    }

@Suppress("ObjectPropertyName")
private var _TallyMark1: ImageVector? = null
