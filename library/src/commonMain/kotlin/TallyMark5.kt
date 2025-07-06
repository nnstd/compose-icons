package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TallyMark5: ImageVector
    get() {
        if (_TallyMark5 != null) {
            return _TallyMark5!!
        }
        _TallyMark5 = ImageVector.Builder(
            name = "TallyMark5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10.73f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(11.36f)
                lineTo(15f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(12.62f)
                lineTo(11f, 13.26f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(13.89f)
                lineTo(7f, 14.5f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(15.15f)
                lineTo(2.57f, 15.92f)
                lineTo(2f, 14f)
                lineTo(5f, 13.05f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(12.42f)
                lineTo(9f, 11.79f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(11.16f)
                lineTo(13f, 10.53f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(9.9f)
                lineTo(17f, 9.26f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(8.63f)
                lineTo(21f, 8f)
                lineTo(21.57f, 9.92f)
                lineTo(19f, 10.73f)
                close()
            }
        }.build()

        return _TallyMark5!!
    }

@Suppress("ObjectPropertyName")
private var _TallyMark5: ImageVector? = null
