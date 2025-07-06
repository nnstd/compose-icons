package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScrewRoundTop: ImageVector
    get() {
        if (_ScrewRoundTop != null) {
            return _ScrewRoundTop!!
        }
        _ScrewRoundTop = ImageVector.Builder(
            name = "ScrewRoundTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 17f)
                verticalLineTo(19f)
                lineTo(12f, 22f)
                lineTo(10.5f, 19f)
                lineTo(13.5f, 17f)
                moveTo(14.5f, 6.3f)
                lineTo(13.5f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(10.5f)
                verticalLineTo(9f)
                lineTo(9.5f, 9.7f)
                verticalLineTo(10.7f)
                lineTo(14.5f, 7.4f)
                verticalLineTo(6.3f)
                moveTo(14.5f, 10.3f)
                lineTo(13.5f, 11f)
                verticalLineTo(9f)
                lineTo(10.5f, 11f)
                verticalLineTo(13f)
                lineTo(9.5f, 13.7f)
                verticalLineTo(14.7f)
                lineTo(14.5f, 11.4f)
                verticalLineTo(10.3f)
                moveTo(14.5f, 14.3f)
                lineTo(13.5f, 15f)
                verticalLineTo(13f)
                lineTo(10.5f, 15f)
                verticalLineTo(17f)
                lineTo(9.5f, 17.7f)
                verticalLineTo(18.7f)
                lineTo(14.5f, 15.4f)
                verticalLineTo(14.3f)
                moveTo(7f, 5f)
                horizontalLineTo(17f)
                curveTo(17f, 5f, 16f, 2f, 12f, 2f)
                curveTo(8f, 2f, 7f, 5f, 7f, 5f)
                close()
            }
        }.build()

        return _ScrewRoundTop!!
    }

@Suppress("ObjectPropertyName")
private var _ScrewRoundTop: ImageVector? = null
