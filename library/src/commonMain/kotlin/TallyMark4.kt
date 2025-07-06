package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TallyMark4: ImageVector
    get() {
        if (_TallyMark4 != null) {
            return _TallyMark4!!
        }
        _TallyMark4 = ImageVector.Builder(
            name = "TallyMark4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                moveTo(11f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                moveTo(15f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                moveTo(19f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _TallyMark4!!
    }

@Suppress("ObjectPropertyName")
private var _TallyMark4: ImageVector? = null
