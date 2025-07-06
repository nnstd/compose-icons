package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TallyMark3: ImageVector
    get() {
        if (_TallyMark3 != null) {
            return _TallyMark3!!
        }
        _TallyMark3 = ImageVector.Builder(
            name = "TallyMark3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(13f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                moveTo(17f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _TallyMark3!!
    }

@Suppress("ObjectPropertyName")
private var _TallyMark3: ImageVector? = null
