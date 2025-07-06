package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartPieOutline: ImageVector
    get() {
        if (_ChartPieOutline != null) {
            return _ChartPieOutline!!
        }
        _ChartPieOutline = ImageVector.Builder(
            name = "ChartPieOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                horizontalLineTo(19.95f)
                quadTo(19.58f, 8.25f, 17.66f, 6.34f)
                quadTo(15.75f, 4.43f, 13f, 4.05f)
                moveTo(11f, 19.95f)
                verticalLineTo(4.05f)
                quadTo(8f, 4.43f, 6f, 6.69f)
                quadTo(4f, 8.95f, 4f, 12f)
                reflectiveQuadTo(6f, 17.31f)
                quadTo(8f, 19.58f, 11f, 19.95f)
                moveTo(13f, 19.95f)
                quadTo(15.75f, 19.6f, 17.68f, 17.68f)
                quadTo(19.6f, 15.75f, 19.95f, 13f)
                horizontalLineTo(13f)
                moveTo(12f, 12f)
                moveTo(12f, 22f)
                quadTo(9.93f, 22f, 8.1f, 21.21f)
                quadTo(6.28f, 20.43f, 4.93f, 19.08f)
                quadTo(3.58f, 17.73f, 2.79f, 15.9f)
                quadTo(2f, 14.08f, 2f, 12f)
                reflectiveQuadTo(2.79f, 8.1f)
                quadTo(3.58f, 6.28f, 4.93f, 4.93f)
                quadTo(6.28f, 3.58f, 8.1f, 2.79f)
                quadTo(9.93f, 2f, 12f, 2f)
                reflectiveQuadTo(15.89f, 2.79f)
                quadTo(17.7f, 3.58f, 19.06f, 4.94f)
                quadTo(20.43f, 6.3f, 21.21f, 8.11f)
                quadTo(22f, 9.93f, 22f, 12f)
                quadTo(22f, 14.05f, 21.21f, 15.88f)
                quadTo(20.43f, 17.7f, 19.08f, 19.06f)
                quadTo(17.73f, 20.43f, 15.9f, 21.21f)
                quadTo(14.08f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _ChartPieOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieOutline: ImageVector? = null
