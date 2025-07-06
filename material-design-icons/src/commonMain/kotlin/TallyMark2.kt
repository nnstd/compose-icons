package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TallyMark2: ImageVector
    get() {
        if (_TallyMark2 != null) {
            return _TallyMark2!!
        }
        _TallyMark2 = ImageVector.Builder(
            name = "TallyMark2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                moveTo(15f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _TallyMark2!!
    }

@Suppress("ObjectPropertyName")
private var _TallyMark2: ImageVector? = null
