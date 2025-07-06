package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftExcel: ImageVector
    get() {
        if (_MicrosoftExcel != null) {
            return _MicrosoftExcel!!
        }
        _MicrosoftExcel = ImageVector.Builder(
            name = "MicrosoftExcel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.17f, 3.25f)
                quadTo(21.5f, 3.25f, 21.76f, 3.5f)
                quadTo(22f, 3.74f, 22f, 4.08f)
                verticalLineTo(19.92f)
                quadTo(22f, 20.26f, 21.76f, 20.5f)
                quadTo(21.5f, 20.75f, 21.17f, 20.75f)
                horizontalLineTo(7.83f)
                quadTo(7.5f, 20.75f, 7.24f, 20.5f)
                quadTo(7f, 20.26f, 7f, 19.92f)
                verticalLineTo(17f)
                horizontalLineTo(2.83f)
                quadTo(2.5f, 17f, 2.24f, 16.76f)
                quadTo(2f, 16.5f, 2f, 16.17f)
                verticalLineTo(7.83f)
                quadTo(2f, 7.5f, 2.24f, 7.24f)
                quadTo(2.5f, 7f, 2.83f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(4.08f)
                quadTo(7f, 3.74f, 7.24f, 3.5f)
                quadTo(7.5f, 3.25f, 7.83f, 3.25f)
                moveTo(7f, 13.06f)
                lineTo(8.18f, 15.28f)
                horizontalLineTo(9.97f)
                lineTo(8f, 12.06f)
                lineTo(9.93f, 8.89f)
                horizontalLineTo(8.22f)
                lineTo(7.13f, 10.9f)
                lineTo(7.09f, 10.96f)
                lineTo(7.06f, 11.03f)
                quadTo(6.8f, 10.5f, 6.5f, 9.96f)
                quadTo(6.25f, 9.43f, 5.97f, 8.89f)
                horizontalLineTo(4.16f)
                lineTo(6.05f, 12.08f)
                lineTo(4f, 15.28f)
                horizontalLineTo(5.78f)
                moveTo(13.88f, 19.5f)
                verticalLineTo(17f)
                horizontalLineTo(8.25f)
                verticalLineTo(19.5f)
                moveTo(13.88f, 15.75f)
                verticalLineTo(12.63f)
                horizontalLineTo(12f)
                verticalLineTo(15.75f)
                moveTo(13.88f, 11.38f)
                verticalLineTo(8.25f)
                horizontalLineTo(12f)
                verticalLineTo(11.38f)
                moveTo(13.88f, 7f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.25f)
                verticalLineTo(7f)
                moveTo(20.75f, 19.5f)
                verticalLineTo(17f)
                horizontalLineTo(15.13f)
                verticalLineTo(19.5f)
                moveTo(20.75f, 15.75f)
                verticalLineTo(12.63f)
                horizontalLineTo(15.13f)
                verticalLineTo(15.75f)
                moveTo(20.75f, 11.38f)
                verticalLineTo(8.25f)
                horizontalLineTo(15.13f)
                verticalLineTo(11.38f)
                moveTo(20.75f, 7f)
                verticalLineTo(4.5f)
                horizontalLineTo(15.13f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _MicrosoftExcel!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftExcel: ImageVector? = null
