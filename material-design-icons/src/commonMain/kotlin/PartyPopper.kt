package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PartyPopper: ImageVector
    get() {
        if (_PartyPopper != null) {
            return _PartyPopper!!
        }
        _PartyPopper = ImageVector.Builder(
            name = "PartyPopper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.53f, 1.45f)
                lineTo(13.45f, 2.53f)
                lineTo(15.05f, 4.13f)
                curveTo(15.27f, 4.38f, 15.38f, 4.67f, 15.38f, 5f)
                reflectiveCurveTo(15.27f, 5.64f, 15.05f, 5.86f)
                lineTo(11.5f, 9.47f)
                lineTo(12.5f, 10.55f)
                lineTo(16.13f, 6.94f)
                curveTo(16.66f, 6.35f, 16.92f, 5.7f, 16.92f, 5f)
                curveTo(16.92f, 4.3f, 16.66f, 3.64f, 16.13f, 3.05f)
                lineTo(14.53f, 1.45f)
                moveTo(10.55f, 3.47f)
                lineTo(9.47f, 4.55f)
                lineTo(10.08f, 5.11f)
                curveTo(10.3f, 5.33f, 10.41f, 5.63f, 10.41f, 6f)
                reflectiveCurveTo(10.3f, 6.67f, 10.08f, 6.89f)
                lineTo(9.47f, 7.45f)
                lineTo(10.55f, 8.53f)
                lineTo(11.11f, 7.92f)
                curveTo(11.64f, 7.33f, 11.91f, 6.69f, 11.91f, 6f)
                curveTo(11.91f, 5.28f, 11.64f, 4.63f, 11.11f, 4.03f)
                lineTo(10.55f, 3.47f)
                moveTo(21f, 5.06f)
                curveTo(20.31f, 5.06f, 19.67f, 5.33f, 19.08f, 5.86f)
                lineTo(13.45f, 11.5f)
                lineTo(14.53f, 12.5f)
                lineTo(20.11f, 6.94f)
                curveTo(20.36f, 6.69f, 20.66f, 6.56f, 21f, 6.56f)
                reflectiveCurveTo(21.64f, 6.69f, 21.89f, 6.94f)
                lineTo(22.5f, 7.55f)
                lineTo(23.53f, 6.47f)
                lineTo(22.97f, 5.86f)
                curveTo(22.38f, 5.33f, 21.72f, 5.06f, 21f, 5.06f)
                moveTo(7f, 8f)
                lineTo(2f, 22f)
                lineTo(16f, 17f)
                lineTo(7f, 8f)
                moveTo(19f, 11.06f)
                curveTo(18.3f, 11.06f, 17.66f, 11.33f, 17.06f, 11.86f)
                lineTo(15.47f, 13.45f)
                lineTo(16.55f, 14.53f)
                lineTo(18.14f, 12.94f)
                curveTo(18.39f, 12.69f, 18.67f, 12.56f, 19f, 12.56f)
                curveTo(19.33f, 12.56f, 19.63f, 12.69f, 19.88f, 12.94f)
                lineTo(21.5f, 14.53f)
                lineTo(22.55f, 13.5f)
                lineTo(20.95f, 11.86f)
                curveTo(20.36f, 11.33f, 19.7f, 11.06f, 19f, 11.06f)
                close()
            }
        }.build()

        return _PartyPopper!!
    }

@Suppress("ObjectPropertyName")
private var _PartyPopper: ImageVector? = null
