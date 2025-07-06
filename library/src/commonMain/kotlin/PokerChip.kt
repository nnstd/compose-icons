package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PokerChip: ImageVector
    get() {
        if (_PokerChip != null) {
            return _PokerChip!!
        }
        _PokerChip = ImageVector.Builder(
            name = "PokerChip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                curveTo(23f, 18.08f, 18.08f, 23f, 12f, 23f)
                curveTo(5.92f, 23f, 1f, 18.08f, 1f, 12f)
                curveTo(1f, 5.92f, 5.92f, 1f, 12f, 1f)
                curveTo(18.08f, 1f, 23f, 5.92f, 23f, 12f)
                moveTo(13f, 4.06f)
                curveTo(15.13f, 4.33f, 17.07f, 5.45f, 18.37f, 7.16f)
                lineTo(20.11f, 6.16f)
                curveTo(18.45f, 3.82f, 15.86f, 2.3f, 13f, 2f)
                verticalLineTo(4.06f)
                moveTo(3.89f, 6.16f)
                lineTo(5.63f, 7.16f)
                curveTo(6.93f, 5.45f, 8.87f, 4.33f, 11f, 4.06f)
                verticalLineTo(2f)
                curveTo(8.14f, 2.3f, 5.55f, 3.82f, 3.89f, 6.16f)
                moveTo(2.89f, 16.1f)
                lineTo(4.62f, 15.1f)
                curveTo(3.79f, 13.12f, 3.79f, 10.88f, 4.62f, 8.9f)
                lineTo(2.89f, 7.9f)
                curveTo(1.7f, 10.5f, 1.7f, 13.5f, 2.89f, 16.1f)
                moveTo(11f, 19.94f)
                curveTo(8.87f, 19.67f, 6.93f, 18.55f, 5.63f, 16.84f)
                lineTo(3.89f, 17.84f)
                curveTo(5.55f, 20.18f, 8.14f, 21.7f, 11f, 22f)
                verticalLineTo(19.94f)
                moveTo(20.11f, 17.84f)
                lineTo(18.37f, 16.84f)
                curveTo(17.07f, 18.55f, 15.13f, 19.67f, 13f, 19.94f)
                verticalLineTo(21.94f)
                curveTo(15.85f, 21.65f, 18.44f, 20.16f, 20.11f, 17.84f)
                moveTo(21.11f, 16.1f)
                curveTo(22.3f, 13.5f, 22.3f, 10.5f, 21.11f, 7.9f)
                lineTo(19.38f, 8.9f)
                curveTo(20.21f, 10.88f, 20.21f, 13.12f, 19.38f, 15.1f)
                lineTo(21.11f, 16.1f)
                moveTo(15f, 12f)
                lineTo(12f, 7f)
                lineTo(9f, 12f)
                lineTo(12f, 17f)
                lineTo(15f, 12f)
                close()
            }
        }.build()

        return _PokerChip!!
    }

@Suppress("ObjectPropertyName")
private var _PokerChip: ImageVector? = null
