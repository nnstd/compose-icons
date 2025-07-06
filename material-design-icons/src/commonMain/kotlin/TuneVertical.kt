package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TuneVertical: ImageVector
    get() {
        if (_TuneVertical != null) {
            return _TuneVertical!!
        }
        _TuneVertical = ImageVector.Builder(
            name = "TuneVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                moveTo(19f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                moveTo(3f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                moveTo(15f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                moveTo(11f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                moveTo(15f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _TuneVertical!!
    }

@Suppress("ObjectPropertyName")
private var _TuneVertical: ImageVector? = null
