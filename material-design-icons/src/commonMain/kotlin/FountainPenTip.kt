package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FountainPenTip: ImageVector
    get() {
        if (_FountainPenTip != null) {
            return _FountainPenTip!!
        }
        _FountainPenTip = ImageVector.Builder(
            name = "FountainPenTip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.54f, 3.5f)
                lineTo(20.5f, 8.47f)
                lineTo(19.07f, 9.88f)
                lineTo(14.12f, 4.93f)
                lineTo(15.54f, 3.5f)
                moveTo(3.5f, 19.78f)
                lineTo(10f, 13.31f)
                curveTo(9.9f, 13f, 9.97f, 12.61f, 10.23f, 12.35f)
                curveTo(10.62f, 11.96f, 11.26f, 11.96f, 11.65f, 12.35f)
                curveTo(12.04f, 12.75f, 12.04f, 13.38f, 11.65f, 13.77f)
                curveTo(11.39f, 14.03f, 11f, 14.1f, 10.69f, 14f)
                lineTo(4.22f, 20.5f)
                lineTo(14.83f, 16.95f)
                lineTo(18.36f, 10.59f)
                lineTo(13.42f, 5.64f)
                lineTo(7.05f, 9.17f)
                lineTo(3.5f, 19.78f)
                close()
            }
        }.build()

        return _FountainPenTip!!
    }

@Suppress("ObjectPropertyName")
private var _FountainPenTip: ImageVector? = null
