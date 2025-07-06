package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlowerTulip: ImageVector
    get() {
        if (_FlowerTulip != null) {
            return _FlowerTulip!!
        }
        _FlowerTulip = ImageVector.Builder(
            name = "FlowerTulip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 13f)
                moveTo(12f, 22f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                moveTo(18f, 3f)
                verticalLineTo(8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                verticalLineTo(3f)
                curveTo(6.74f, 3f, 7.47f, 3.12f, 8.16f, 3.39f)
                curveTo(8.71f, 3.62f, 9.2f, 3.96f, 9.61f, 4.39f)
                lineTo(12f, 2f)
                lineTo(14.39f, 4.39f)
                curveTo(14.8f, 3.96f, 15.29f, 3.62f, 15.84f, 3.39f)
                curveTo(16.53f, 3.12f, 17.26f, 3f, 18f, 3f)
                close()
            }
        }.build()

        return _FlowerTulip!!
    }

@Suppress("ObjectPropertyName")
private var _FlowerTulip: ImageVector? = null
